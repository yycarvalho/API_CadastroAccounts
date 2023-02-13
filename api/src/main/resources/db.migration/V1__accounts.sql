CREATE TABLE `accounts` (
  `login` varchar(45) NOT NULL DEFAULT '',
  `password` varchar(45) DEFAULT NULL,
  `lastactive` decimal(20,0) DEFAULT NULL,
  `access_level` int(11) DEFAULT NULL,
  `lastIP` varchar(20) DEFAULT NULL,
  `lastServer` int(4) DEFAULT 1,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1