-- 用户表
CREATE TABLE `user` (
                        `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
                        `user_name` VARCHAR ( 256 ) NOT NULL DEFAULT '' COMMENT '用户昵称',
                        `user_password` VARCHAR ( 512 ) NOT NULL COMMENT '密码',
                        `phone` VARCHAR ( 32 ) NOT NULL DEFAULT '' COMMENT '手机号',
                        `user_avatar` VARCHAR ( 1024 ) NOT NULL DEFAULT '' COMMENT '用户头像',
                        `gender` TINYINT NOT NULL DEFAULT 0 COMMENT '性别 0-未知，1-男，2-女',
                        `user_role` TINYINT NOT NULL DEFAULT 0 COMMENT '用户角色：0-普通用户, 1-管理员',
                        `is_delete` TINYINT NOT NULL DEFAULT 0 COMMENT '是否删除',
                        `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                        `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                        PRIMARY KEY ( `id` )
) ENGINE = InnoDB COMMENT = '用户表';
