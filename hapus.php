<?php
include "koneksi.php";
session_start();
if(!isset($_SESSION['username'])){
    header("location:login.php?login_dahulu");
}

$kd_sewa=$_GET['kd_sewa'];
$sql="DELETE FROM sewa WHERE kd_sewa='$kd_sewa'";
$query=mysqli_query($koneksi,$sql);

    if($query){
        header ("location:index.php?hapus=sukses");
    } else {
        header ("location:index.php?hapus=gagal");
    }
    ?>