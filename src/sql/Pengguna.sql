CREATE TABLE `212praktikumjava2`.`pengguna` ( `id` INT NOT NULL AUTO_INCREMENT , `username` VARCHAR(255) NOT NULL , `password` VARCHAR(255) NOT NULL , `namalengkap` VARCHAR(255) NOT NULL , `level` VARCHAR(255) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;

INSERT INTO `pengguna` (`id`, `username`, `password`, `namalengkap`, `level`) VALUES
(NULL, 'admin', MD5('admin123'), 'Saya Admin', 'admin'),
(NULL, 'user1', MD5('user1'), 'Saya User 1', 'user');
(NULL, 'user2', MD5('user2'), 'Saya User 2', 'user');
(NULL, 'user3', MD5('user3'), 'Saya User 3', 'user');