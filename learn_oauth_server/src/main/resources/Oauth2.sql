CREATE TABLE
    oauth_access_token
    (
        token_id VARCHAR(255),
        token mediumblob,
        authentication_id VARCHAR(255) NOT NULL,
        user_name VARCHAR(255),
        client_id VARCHAR(255),
        authentication mediumblob,
        refresh_token VARCHAR(255),
        PRIMARY KEY (authentication_id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
    
CREATE TABLE
    oauth_approvals
    (
        userId VARCHAR(256),
        clientId VARCHAR(256),
        scope VARCHAR(256),
        status VARCHAR(10),
        expiresAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON
    UPDATE
        CURRENT_TIMESTAMP,
        lastModifiedAt TIMESTAMP DEFAULT '0000-00-00 00:00:00'
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
CREATE TABLE
    oauth_client_details
    (
        client_id VARCHAR(255) NOT NULL,
        resource_ids VARCHAR(255),
        client_secret VARCHAR(255),
        scope VARCHAR(255),
        authorized_grant_types VARCHAR(255),
        web_server_redirect_uri VARCHAR(255),
        authorities VARCHAR(255),
        access_token_validity INT,
        refresh_token_validity INT,
        additional_information VARCHAR(4096),
        autoapprove VARCHAR(255),
        PRIMARY KEY (client_id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
CREATE TABLE
    oauth_client_token
    (
        token_id VARCHAR(255),
        token mediumblob,
        authentication_id VARCHAR(255) NOT NULL,
        user_name VARCHAR(255),
        client_id VARCHAR(255),
        PRIMARY KEY (authentication_id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
CREATE TABLE
    oauth_code
    (
        code VARCHAR(256),
        authentication mediumblob
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
CREATE TABLE
    oauth_refresh_token
    (
        token_id VARCHAR(256),
        token mediumblob,
        authentication mediumblob
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;