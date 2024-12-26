<?php
include "navbar.php";
include "koneksi.php";
session_start();
if(!isset($_SESSION['username'])){
    header("location:login.php?login_dahulu");
}


$kd_sewa=$_GET['kd_sewa'];

$sql_mobil="SELECT * FROM mobil WHERE NOT stok=0";
$query_mobil=mysqli_query($koneksi,$sql_mobil);
$sql_customer="SELECT * FROM customer";
$query_customer=mysqli_query($koneksi,$sql_customer);

$sql=" SELECT * FROM sewa WHERE kd_sewa='$kd_sewa'";
$query=mysqli_query($koneksi,$sql);
while($sewa=mysqli_fetch_assoc($query)){


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
<body>
<div class="container">
        <br><br><br>
    <form action="proses_edit.php" method="POST">
<input type="hidden" name="kd_sewa" value="<?=
$sewa['kd_sewa'];?>">

    <label>Kode Mobil</label>
    <select name="kd_mobil" id="" class="form-control">
            <?php while($mobil=mysqli_fetch_assoc($query_mobil)){ ?>
            <option value="<?=$mobil['kd_mobil'];?>" <?php if($mobil['kd_mobil']==$sewa['kd_mobil']){echo "selected";} ?>><?=$mobil['jenis_mobil'];?></option>
      <?php }?> </select>
    <label>Kode Customer</label>
    <select name="kd_customer" id="" class="form-control">
    <?php while($customer=mysqli_fetch_assoc($query_customer)){       ?>
            <option value="<?=$customer['kd_customer'];?>" <?php if($customer['kd_customer']==$sewa['kd_customer']){echo "selected";} ?>><?=$customer['nama'];?></option>
      <?php }?> </select>
    <label>Tanggal Pinjam</label>
    <input type="date" name="tgl_pinjam" value="<?=$sewa['tgl_pinjam'];?>" class="form-control"><br>
    <label>Tanggal Kembali</label>
    <input type="date" name="tgl_kembali" value="<?=$sewa['tgl_kembali'];?>" class="form-control"><br>
    <input type="submit" value="SIMPAN" class="btn btn-dark">

</form>
</body>
</html>
<?php } ?>