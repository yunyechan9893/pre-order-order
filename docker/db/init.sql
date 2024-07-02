
USE msa;

CREATE TABLE `order`
(
    `id`          bigint       NOT NULL auto_increment PRIMARY KEY,
    `user_id`     bigint       NOT NULL,
    `created_at`  datetime     NOT NULL DEFAULT NOW(),
    `modified_at` datetime     NOT NULL DEFAULT NOW()
);

CREATE TABLE `order_detail`
(
    `id`          bigint       NOT NULL auto_increment PRIMARY KEY,
    `order_id`    bigint       NOT NULL,
    `product_id`  bigint       NOT NULL,
    `quantity`    int          NULL,
    `status`      varchar(255) NULL,
    FOREIGN KEY (`order_id`) REFERENCES `order`(`id`)
);


CREATE TABLE `wishlist`
(
    `id`          bigint   NOT NULL auto_increment PRIMARY KEY,
    `user_id`     bigint   NOT NULL,
    `catalogue_id`    bigint   NOT NULL,
    `quantity`    int      NULL,
    `created_at`  datetime NOT NULL DEFAULT NOW(),
    `modified_at` datetime NOT NULL DEFAULT NOW()
);