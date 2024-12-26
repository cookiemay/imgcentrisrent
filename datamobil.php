<?php
include 'koneksi.php';
include 'navbar.php';
session_start();
if (!isset($_SESSION['username'])) {
    header("location:login.php");
}

$query = mysqli_query($koneksi, "select * from mobil");

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data Mobil</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
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
        <div class="row">
            <div class="col-sm-12 col-md-12 col-lg-12">

                <div class="card shadow">
                    <div class="navbar card-header bg-white text-white">
                        <h3>Data Mobil</h3>
                        <a href="tambah_mobil.php" class="btn btn-primary">Tambah Mobil</a>
                    </div>
                    <div class="card-body">

                        <table class="table table-bordered">
                            <tr class="text-center">
                                <th>KD MOBIL</th>
                                <th>JENIS MOBIL</th>
                                <th>WARNA</th>
                                <th>STOK</th>
                                <th>TARIF SEWA/HARI</th>
                                <th>AKSI</th>
                            </tr>
                            <?php
                            while ($mobil = mysqli_fetch_assoc($query)) { ?>
                                <tr class="text-center">
                                    <td><?= $mobil['kd_mobil'] ?></td>
                                    <td><?= $mobil['jenis_mobil'] ?></td>
                                    <td><?= $mobil['warna'] ?></td>
                                    <td><?= $mobil['stok'] ?></td>
                                    <td>Rp. <?= number_format($mobil['tarif_sewa']) ?></td>
                                    <td>
                                        <a href="edit_mobil.php?kd_mobil=<?= $mobil['kd_mobil'] ?>" class="btn btn-warning">EDIT</a>
                                        <a href="hapus_mobil.php?kd_mobil=<?= $mobil['kd_mobil'] ?>" onclick="return confirm('YAKIN HAPUS MOBIL?')" class="btn btn-danger">HAPUS</a>
                                    </td>
                                </tr>
                            <?php } ?>
                        </table>
                        <a href="cetak_mobil.php" class="btn btn-outline-dark">PREVIEW PRINT</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>
</body>

</html>