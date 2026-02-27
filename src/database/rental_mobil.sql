-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 29, 2024 at 03:05 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rental_mobil`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `nik_customer` int(16) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `alamat_customer` varchar(100) DEFAULT NULL,
  `no_telp_customer` varchar(20) DEFAULT NULL,
  `sim` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`nik_customer`, `nama`, `alamat_customer`, `no_telp_customer`, `sim`) VALUES
(9, 'Kana', 'Purwokerto', '08717623', 'Punya'),
(10, 'Alex', 'Banyumas', '08823617', 'Punya'),
(11, 'Dinda', 'Cilacap', '08123456789', 'Punya'),
(12, 'Budi', 'Purwokerto', '08576543210', 'Punya'),
(13, 'Ani', 'Banyumas', '08987654321', 'Punya'),
(14, 'Candra', 'Kebumen', '08776543210', 'Punya'),
(15, 'Eka', 'Purbalingga', '08234567890', 'Punya'),
(16, 'Fajar', 'Banjarnegara', '08387654321', 'Punya'),
(17, 'Gita', 'Wonosobo', '08112345678', 'Punya'),
(19, 'Intan', 'Pemalang', '08967890123', 'Punya'),
(20, 'Joko', 'Pekalongan', '08790123456', 'Punya'),
(21, 'Kartika', 'Semarang', '08223456789', 'Punya'),
(22, 'Lusi', 'Surakarta', '08556789012', 'Punya'),
(23, 'Maya', 'Yogyakarta', '08990123456', 'Punya'),
(24, 'Nita', 'Solo', '08777654321', 'Punya'),
(25, 'Oki', 'Klaten', '08222456789', 'Punya'),
(26, 'Izzat', 'Cilacap', '085879161454', 'Tidak Punya');

-- --------------------------------------------------------

--
-- Table structure for table `mobil`
--

CREATE TABLE `mobil` (
  `nomor_polisi` varchar(15) NOT NULL,
  `jenis_mobil` varchar(20) DEFAULT NULL,
  `merk` varchar(20) DEFAULT NULL,
  `biaya_pinjam_per_hari` int(11) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mobil`
--

INSERT INTO `mobil` (`nomor_polisi`, `jenis_mobil`, `merk`, `biaya_pinjam_per_hari`, `status`) VALUES
('A8901HIJ', 'Hatchback', 'Hyundai', 80000, 'Tersedia'),
('B1234ABC', 'SUV', 'Toyota', 150000, 'Tersedia'),
('B9876XYZ', 'Hatchback', 'Kia', 70000, 'Tersedia'),
('C5678RST', 'SUV', 'Ford', 180000, 'Tersedia'),
('D4567EFG', 'Sedan', 'Honda', 100000, 'Tersedia'),
('K2345LMN', 'Pickup', 'Mitsubishi', 200000, 'Tersedia'),
('M4567ABC', 'Pickup', 'Isuzu', 250000, 'Tersedia'),
('N8901DEF', 'Minivan', 'Daihatsu', 110000, 'Tersedia'),
('R1234kjs', 'SUV', 'Honda', 1000000, 'Tidak Tersedia'),
('R1298jka', 'Pickup', 'Suzuki', 30000, 'Tidak Tersedia'),
('R1978kwk', 'SUV', 'Mitsubisi', 60000, 'Tidak Tersedia'),
('V1234UVW', 'Sedan', 'Mazda', 90000, 'Tersedia');

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` int(11) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `alamat` varchar(100) DEFAULT NULL,
  `telp` varchar(15) DEFAULT NULL,
  `jabatan` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama`, `alamat`, `telp`, `jabatan`) VALUES
(1, 'Andi', 'Jakarta', '08123456789', 'Manajer'),
(2, 'Budi', 'Bandung', '08576543210', 'Staff'),
(3, 'Cici', 'Surabaya', '08987654321', 'Direktur'),
(4, 'Dedi', 'Semarang', '08776543210', 'Kepala Bagian'),
(5, 'Eni', 'Medan', '08234567890', 'Supervisor'),
(6, 'Fajar', 'Palembang', '08387654321', 'Karyawan'),
(7, 'Gita', 'Denpasar', '08112345678', 'Asisten Manajer'),
(8, 'Hendra', 'Makassar', '08534567890', 'Konsultan'),
(9, 'Intan', 'Yogyakarta', '08967890123', 'Analis'),
(12, 'Sigit', 'Purwokertoo', '08771271', 'CEO'),
(16, 'Fadhil Tazakka Pribadi', 'Adipala', '08159544739', 'Programer');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman_mobil`
--

CREATE TABLE `peminjaman_mobil` (
  `id_peminjaman` int(11) NOT NULL,
  `id_pegawai` int(11) DEFAULT NULL,
  `nomor_polisi` varchar(15) DEFAULT NULL,
  `nik_customer` int(11) DEFAULT NULL,
  `tanggal_peminjaman` date DEFAULT NULL,
  `harga_pinjam` int(11) DEFAULT NULL,
  `hari_sewa` int(11) NOT NULL,
  `bayar` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `peminjaman_mobil`
--

INSERT INTO `peminjaman_mobil` (`id_peminjaman`, `id_pegawai`, `nomor_polisi`, `nik_customer`, `tanggal_peminjaman`, `harga_pinjam`, `hari_sewa`, `bayar`) VALUES
(6, 12, 'R1298jka', 9, '2024-12-26', 30000, 3, 90000),
(8, 12, 'R1978kwk', 9, '2024-12-26', 60000, 3, 180000),
(10, 12, 'R1298jka', 10, '2024-12-26', 30000, 3, 90000),
(11, 12, 'R1298jka', 10, '2024-12-26', 30000, 3, 90000),
(12, 12, 'R1298jka', 10, '2024-12-26', 30000, 3, 90000),
(13, 12, 'R1298jka', 9, '2024-12-26', 30000, 3, 90000),
(18, 12, 'R1298jka', 9, '2024-12-25', 30000, 1, 30000),
(25, 16, 'V1234UVW', 26, '2024-12-29', 90000, 5, 450000);

-- --------------------------------------------------------

--
-- Table structure for table `pengembalian_mobil`
--

CREATE TABLE `pengembalian_mobil` (
  `id_pengembalian` int(11) NOT NULL,
  `id_peminjaman` int(11) DEFAULT NULL,
  `id_pegawai` int(11) NOT NULL,
  `nik_customer` int(11) NOT NULL,
  `nomor_polisi` varchar(15) NOT NULL,
  `tanggal_pengembalian` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pengembalian_mobil`
--

INSERT INTO `pengembalian_mobil` (`id_pengembalian`, `id_peminjaman`, `id_pegawai`, `nik_customer`, `nomor_polisi`, `tanggal_pengembalian`) VALUES
(4, 6, 12, 9, 'R1298jka', '2024-12-26'),
(5, 6, 12, 9, 'R1298jka', '2024-12-26'),
(6, 13, 12, 9, 'R1298jka', '2024-12-26'),
(7, 6, 12, 9, 'R1298jka', '2024-12-26'),
(8, 25, 16, 26, 'V1234UVW', '2024-12-29'),
(9, 25, 16, 26, 'V1234UVW', '2024-12-29');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`nik_customer`);

--
-- Indexes for table `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`nomor_polisi`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indexes for table `peminjaman_mobil`
--
ALTER TABLE `peminjaman_mobil`
  ADD PRIMARY KEY (`id_peminjaman`),
  ADD KEY `id_pegawai` (`id_pegawai`),
  ADD KEY `nomor_polisi` (`nomor_polisi`),
  ADD KEY `nik_customer` (`nik_customer`);

--
-- Indexes for table `pengembalian_mobil`
--
ALTER TABLE `pengembalian_mobil`
  ADD PRIMARY KEY (`id_pengembalian`),
  ADD KEY `id_peminjaman` (`id_peminjaman`),
  ADD KEY `nomor_polisi` (`nomor_polisi`),
  ADD KEY `id_pegawai` (`id_pegawai`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `nik_customer` int(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `pegawai`
--
ALTER TABLE `pegawai`
  MODIFY `id_pegawai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `peminjaman_mobil`
--
ALTER TABLE `peminjaman_mobil`
  MODIFY `id_peminjaman` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `pengembalian_mobil`
--
ALTER TABLE `pengembalian_mobil`
  MODIFY `id_pengembalian` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `peminjaman_mobil`
--
ALTER TABLE `peminjaman_mobil`
  ADD CONSTRAINT `peminjaman_mobil_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`),
  ADD CONSTRAINT `peminjaman_mobil_ibfk_2` FOREIGN KEY (`nomor_polisi`) REFERENCES `mobil` (`nomor_polisi`),
  ADD CONSTRAINT `peminjaman_mobil_ibfk_3` FOREIGN KEY (`nik_customer`) REFERENCES `customer` (`nik_customer`);

--
-- Constraints for table `pengembalian_mobil`
--
ALTER TABLE `pengembalian_mobil`
  ADD CONSTRAINT `pengembalian_mobil_ibfk_1` FOREIGN KEY (`id_peminjaman`) REFERENCES `peminjaman_mobil` (`id_peminjaman`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
