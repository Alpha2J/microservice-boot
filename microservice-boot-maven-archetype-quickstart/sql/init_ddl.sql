CREATE DATABASE mbma_quickstart;
USE mbma_quickstart;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`         BIGINT(20)   NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `avatar`     VARCHAR(255) NOT NULL DEFAULT '' COMMENT '用户头像',
    `gender`     TINYINT(4)   NOT NULL DEFAULT 0 COMMENT '用户性别',
    `nickname`   VARCHAR(255) NOT NULL DEFAULT '' COMMENT '用户昵称',
    `region`     VARCHAR(255) NOT NULL DEFAULT '' COMMENT '用户地区',
    `open_id`    VARCHAR(255) NOT NULL DEFAULT '' COMMENT '用户在微信下的openId',
    `created_at` DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at` DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    UNIQUE KEY `uniq_open_id` (`open_id`)
) COMMENT '用户表';

INSERT INTO `user`
VALUES (1,
        'https://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTIsibK6mViaF9pPa1IC5nkQQYwZicGHNSAe5PMO81O13SXXYKKfyBic0anI2mP7FIJMapJRSdHa7tFBkg/132',
        1, 'Alpha', 'United States,Florida,Orlando', 'o8vl75Wpap9aUJUACihpSrR6Dzo8', '2021-01-23 11:02:46',
        '2021-01-23 11:05:42');
