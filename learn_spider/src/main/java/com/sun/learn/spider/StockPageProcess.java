package com.sun.learn.spider;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.commons.text.StringEscapeUtils;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.alibaba.fastjson.JSONObject;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

public class StockPageProcess implements PageProcessor {

	private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);

	private static String url = "http://quote.stockstar.com/webhandler/rank.ashx?type=a&sortfield=3&direction=1&pageid=1&_=1532418159709";

	@Override
	public void process(Page page) {

		Set<String> urls = new HashSet<>();
		String pStr = page.getJson().toString();
		JSONObject resJson = JSONObject.parseObject(pStr.substring(12, pStr.length() - 1));
		String html ="<body>" + StringEscapeUtils.unescapeJava(resJson.getString("html")).replaceAll("align_center ",
				"align_center") + "</body>";

		Html j = new Html(html);
		Elements es = j.getDocument().getElementsByTag("a");
		for(int i=0;i<es.size()/2;i++) {
			urls.add(es.get(2*i).text());
		}
		
		int x = 0b1100110;
		x = 10_000_000;
		
		System.out.println("x=" + x);
		
		urls.stream().map(u -> {
			String p = "http://stock.quote.stockstar.com/dividend_";
			return p + u + ".shtml";
		}).collect(Collectors.toSet());
		
		urls.forEach(u -> {
			System.out.println(u.toString());
		});
		
	}

	@Override
	public Site getSite() {
		return site;
	}

	public static void main(String[] args) {
		Spider.create(new StockPageProcess()).addUrl(url).thread(1).run();
	}

}
