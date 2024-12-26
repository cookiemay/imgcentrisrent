<?php
include "koneksi.php";
include "navbar.php";
session_start();
if (!isset($_SESSION['username'])) {
    header("location:login.php?login_dahulu");
}


$sql = "SELECT *,mobil.jenis_mobil,customer.nama FROM sewa 
JOIN mobil ON sewa.kd_mobil=mobil.kd_mobil  
JOIN customer ON sewa.kd_customer=customer.kd_customer";
$query = mysqli_query($koneksi, $sql);
$no = 1;
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="bootstrap.min.css">
</head>
<style>
    body {
      background: #f8f9fa;
      color: #343a40;
      font-family: Arial, sans-serif;
    }
</style>
<body>
    <div class="container py-5">
        <div class="alert alert-info">
            <h3>INFORMASI!!!</h3> MOBIL YANG TIDAK BISA DISEWA KARENA STOK KOSONG:
            <?php
            $mobil = mysqli_query($koneksi, "SELECT * FROM mobil");
            while ($mbl = mysqli_fetch_assoc($mobil)) {
                if ($mbl['stok'] == 0) { ?>
                    <b class="badge bg-danger text-white"><?= $mbl['jenis_mobil'] ?></b>
            <?php } else {
                    echo "";
                }
            } ?>
        </div>
        <div class="card shadow">
            <div class="navbar card-header bg-dark text-white">
                <h3>Rental Mobil</h3>
                <a href="tambah.php" class="btn btn-primary">TAMBAH</a>
            </div>
            <div class="card-body">
                <table class="table table-striped table-hover table-bordered">
                    <tr class="text-center">
                        <th>KD SEWA</th>
                        <th>JENIS MOBIL</th>
                        <th>NAMA CUSTOMER</th>
                        <th>TANGGAL PINJAM</th>
                        <th>TANGGAL KEMBALI</th>
                        <th>TOTAL SEWA</th>
                        <th>AKSI</th>
                    </tr>
                    <?php
                    while ($sewa = mysqli_fetch_assoc($query)) { ?>
                        <tr class="text-center">
                            <td><?= ($sewa['kd_sewa']) ?></td>
                            <td><?= strtoupper($sewa['jenis_mobil']) ?></td>
                            <td><?= strtoupper($sewa['nama']) ?></td>
                            <td><?= date("d - m - Y", strtotime($sewa['tgl_pinjam'])) ?></td>
                            <td><?= date("d - m - Y", strtotime($sewa['tgl_kembali'])) ?></td>
                            <td>Rp. <?= number_format($sewa['total_sewa']) ?></td>
                            <td>
                                <a href="edit.php?kd_sewa=<?= $sewa['kd_sewa'] ?>" class="btn btn-warning">EDIT</a>
                                <a href="hapus.php?kd_sewa=<?= $sewa['kd_sewa'] ?>" onclick="return confirm('YAKIN SUDAH SELESAI SEWA?')" class="btn btn-success">SELESAI</a>
                            </td>
                        </tr>
                    <?php } ?>
                </table>
                <a href="cetak.php" class="btn btn-outline-dark">PREVIEW PRINT</a>
            </div>
</body>

</html>