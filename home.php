<?php
include 'koneksi.php';
include 'navbaruser.php';
?>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Rental Mobil - Home</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background: #f8f9fa;
      color: #343a40;
      font-family: Arial, sans-serif;
    }

    .navbar {
      background-color:rgb(255, 255, 255);
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    }

    .navbar-brand {
      font-size: 1.5rem;
      font-weight: bold;
      color:rgb(0, 0, 0);
    }

    .btn-custom {
      background-color: #343a40;
      border: none;
      padding: 10px 20px;
      border-radius: 5px;
      color: white;
      font-size: 1rem;
    }

    .btn-custom:hover {
      background-color: #495057;
    }

    .carousel-item img {
      width: 80%;
      height: 500px;
      object-fit: cover;
      border-radius: 15px;
    }

    .carousel {
  padding: 0 15px; /* Memberikan jarak pada kanan dan kiri carousel */
    }

    .features {
      padding: 40px 20px;
      background: #ffffff;
      border-radius: 15px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
      margin-top: 30px;
    }

    .features h2 {
      text-align: center;
      margin-bottom: 30px;
    }

    .feature-card {
      background: #ffffff;
      border: 1px solid #dee2e6;
      border-radius: 10px;
      color: #343a40;
      padding: 20px;
      text-align: center;
      transition: transform 0.3s, box-shadow 0.3s;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    }

    .feature-card:hover {
      transform: translateY(-10px);
      box-shadow: 0 6px 10px rgba(0, 0, 0, 0.15);
    }

    .contact {
      padding: 50px 20px;
      text-align: center;
      background: #ffffff;
      border-radius: 15px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
      margin-top: 30px;
    }

    .image-box {
    width: 100%;
    height: 200px; /* Atur tinggi gambar agar konsisten */
    overflow: hidden;
    display: flex;
    justify-content: center;
    align-items: center;
  }

  .image-box img {
    width: 90%;
    height: 90%; /* Gambar akan menyesuaikan tinggi */
    object-fit: cover;
  }

    .btn-custom {
      background-color: #343a40;
      border: none;
      color: white;
      font-size: 1rem;
    }

    .btn-custom:hover {
      background-color: #495057;
    }

  </style>
</head>

<body>
    <!-- Carousel Section -->
    <div id="popularCarsCarousel" class="carousel slide mt-5" data-bs-ride="carousel">
      <div class="carousel-inner">
        <div class="carousel-item active">
          <img src="sedan.jpg" class="d-block w-100" alt="Sedan">
          <div class="carousel-caption d-none d-md-block">
            <h5>Sedan</h5>
            <p>Elegan dan hemat bahan bakar.</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="station_wagon.jpg" class="d-block w-100" alt="Station Wagon">
          <div class="carousel-caption d-none d-md-block">
            <h5>Station Wagon</h5>
            <p>Luas dan cocok untuk keluarga besar.</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="suv.jpg" class="d-block w-100" alt="SUV">
          <div class="carousel-caption d-none d-md-block">
            <h5>SUV</h5>
            <p>Nyaman untuk perjalanan jauh dan keluarga.</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="Hatchback.jpg" class="d-block w-100" alt="Hatchback">
          <div class="carousel-caption d-none d-md-block">
            <h5>Hatchback</h5>
            <p>Ideal untuk perjalanan di dalam kota.</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="Avanza.jpg" class="d-block w-100" alt="Avanza">
          <div class="carousel-caption d-none d-md-block">
            <h5>Avanza</h5>
            <p>Mobil keluarga yang ekonomis.</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="Alphard.jpg" class="d-block w-100" alt="Alphard">
          <div class="carousel-caption d-none d-md-block">
            <h5>Alphard</h5>
            <p>Kemewahan untuk perjalanan Anda.</p>
          </div>
        </div>
      </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#popularCarsCarousel" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#popularCarsCarousel" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
      </button>
    </div>

    <!-- Features Section -->
    <div class="features">
      <h2>Kenapa Memilih Kami?</h2>
      <div class="row g-4">
        <div class="col-md-4">
          <div class="card feature-card">
            <i class="bi bi-car-front" style="font-size: 2rem;"></i>
            <h5 class="mt-3">Beragam Pilihan Mobil</h5>
            <p>Pilih kendaraan yang sesuai dengan kebutuhan Anda, mulai dari sedan hingga SUV.</p>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card feature-card">
            <i class="bi bi-wallet2" style="font-size: 2rem;"></i>
            <h5 class="mt-3">Harga Terjangkau</h5>
            <p>Harga sewa yang kompetitif dengan layanan berkualitas.</p>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card feature-card">
            <i class="bi bi-person-check" style="font-size: 2rem;"></i>
            <h5 class="mt-3">Pelayanan Profesional</h5>
            <p>Tim kami siap membantu Anda dengan layanan terbaik.</p>
          </div>
        </div>
      </div>
    </div>

  <div class="container py-5">
  <h2 class="text-center mb-4">Our Best Offers</h2>
  <div class="row row-cols-1 row-cols-md-3 g-4">
    <!-- Card 1 -->
    <div class="col">
      <div class="card h-100 shadow-sm">
        <div class="image-box">
          <img src="sedan.jpg" class="card-img-top" alt="Toyota Sedan">
        </div>
        <div class="card-body text-center">
          <h5 class="card-title">Toyota Sedan</h5>
          <p class="card-text">Rp.450.000,00/hari</p>
          <button type="button" class="btn btn-dark" data-bs-toggle="modal" data-bs-target="#sedanModal">Selengkapnya</button>
        </div>
      </div>
    </div>

    <!-- Card 2 -->
    <div class="col">
      <div class="card h-100 shadow-sm">
        <div class="image-box">
          <img src="suv.jpg" class="card-img-top" alt="Toyota SUV">
        </div>
        <div class="card-body text-center">
          <h5 class="card-title">Toyota SUV</h5>
          <p class="card-text">Rp.1.000.000,00/hari</p>
          <button type="button" class="btn btn-dark" data-bs-toggle="modal" data-bs-target="#suvModal">Selengkapnya</button>
        </div>
      </div>
    </div>

    <!-- Card 3 -->
    <div class="col">
      <div class="card h-100 shadow-sm">
        <div class="image-box">
          <img src="Hatchback.jpg" class="card-img-top" alt="Toyota Hatchback">
        </div>
        <div class="card-body text-center">
          <h5 class="card-title">Toyota Hatchback</h5>
          <p class="card-text">Rp.500.000,00/hari</p>
          <button type="button" class="btn btn-dark" data-bs-toggle="modal" data-bs-target="#hatchbackModal">Selengkapnya</button>
        </div>
      </div>
    </div>

    <!-- Card 4 -->
    <div class="col">
      <div class="card h-100 shadow-sm">
        <div class="image-box">
          <img src="Alphard.jpg" class="card-img-top" alt="Toyota Alphard">
        </div>
        <div class="card-body text-center">
          <h5 class="card-title">Toyota Alphard</h5>
          <p class="card-text">Rp.5.000.000,00/hari</p>
          <button type="button" class="btn btn-dark" data-bs-toggle="modal" data-bs-target="#alphardModal">Selengkapnya</button>
        </div>
      </div>
    </div>

    <!-- Card 5 -->
    <div class="col">
      <div class="card h-100 shadow-sm">
        <div class="image-box">
          <img src="Avanza.jpg" class="card-img-top" alt="Toyota Avanza">
        </div>
        <div class="card-body text-center">
          <h5 class="card-title">Toyota Avanza</h5>
          <p class="card-text">Rp.600.000,00/hari</p>
          <button type="button" class="btn btn-dark" data-bs-toggle="modal" data-bs-target="#avanzaModal">Selengkapnya</button>
        </div>
      </div>
    </div>

    <!-- Card 6 -->
    <div class="col">
      <div class="card h-100 shadow-sm">
        <div class="image-box">
          <img src="station_wagon.jpg" class="card-img-top" alt="Station Wagon">
        </div>
        <div class="card-body text-center">
          <h5 class="card-title">Station Wagon</h5>
          <p class="card-text">Rp.750.000,00/hari</p>
          <button type="button" class="btn btn-dark" data-bs-toggle="modal" data-bs-target="#stationWagonModal">Selengkapnya</button>
        </div>
      </div>
    </div>


<!-- Modal for Sedan -->
<div class="modal fade" id="sedanModal" tabindex="-1" aria-labelledby="sedanModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="sedanModalLabel">Toyota Sedan</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        Elegan dan hemat bahan bakar, ideal untuk perjalanan di kota.
      </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Tutup</button>
          <a href="https://wa.me/6285742618603?text=Halo%20saya%20tertarik%20untuk%20menyewa%20Toyota%20Sedan" target="_blank" class="btn btn-success">Order via WhatsApp</a>
        </div>
      </div>
    </div>
  </div>
</div>

<!-- Modal for SUV -->
<div class="modal fade" id="suvModal" tabindex="-1" aria-labelledby="suvModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="suvModalLabel">Toyota SUV</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        Nyaman untuk perjalanan jauh dan keluarga.
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Tutup</button>
        <a href="https://wa.me/6285742618603?text=Halo%20saya%20tertarik%20untuk%20menyewa%20Toyota%20Sedan" target="_blank" class="btn btn-success">Order via WhatsApp</a>
      </div>
    </div>
  </div>
</div>

<!-- Modal for Hatchback -->
<div class="modal fade" id="hatchbackModal" tabindex="-1" aria-labelledby="hatchbackModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="hatchbackModalLabel">Toyota Hatchback</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        Ideal untuk perjalanan di dalam kota.
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Tutup</button>
        <a href="https://wa.me/6285742618603?text=Halo%20saya%20tertarik%20untuk%20menyewa%20Toyota%20Sedan" target="_blank" class="btn btn-success">Order via WhatsApp</a>
      </div>
    </div>
  </div>
</div>

<!-- Modal for Alphard -->
<div class="modal fade" id="alphardModal" tabindex="-1" aria-labelledby="alphardModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="alphardModalLabel">Toyota Alphard</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        Kendaraan premium dengan kenyamanan maksimal, ideal untuk perjalanan bisnis atau keluarga.
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Tutup</button>
        <a href="https://wa.me/6285742618603?text=Halo%20saya%20tertarik%20untuk%20menyewa%20Toyota%20Sedan" target="_blank" class="btn btn-success">Order via WhatsApp</a>
      </div>
    </div>
  </div>
</div>

<!-- Modal for Avanza -->
<div class="modal fade" id="avanzaModal" tabindex="-1" aria-labelledby="avanzaModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="avanzaModalLabel">Toyota Avanza</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        Pilihan kendaraan keluarga yang andal dan hemat bahan bakar.
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Tutup</button>
        <a href="https://wa.me/6285742618603?text=Halo%20saya%20tertarik%20untuk%20menyewa%20Toyota%20Sedan" target="_blank" class="btn btn-success">Order via WhatsApp</a>
      </div>
    </div>
  </div>
</div>

<!-- Modal for Station Wagon -->
<div class="modal fade" id="stationWagonModal" tabindex="-1" aria-labelledby="stationWagonModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="stationWagonModalLabel">Station Wagon</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        Kendaraan dengan ruang bagasi luas, cocok untuk perjalanan jarak jauh.
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Tutup</button>
        <a href="https://wa.me/6285742618603?text=Halo%20saya%20tertarik%20untuk%20menyewa%20Toyota%20Sedan" target="_blank" class="btn btn-success">Order via WhatsApp</a>
      </div>
    </div>
  </div>
</div>

    <!-- Contact Section -->
    <footer style="background-color: #f8f9fa; padding: 20px; text-align: center; border-top: 1px solid #ddd;">
    <div class="contact">
        <h2>Hubungi Kami</h2>
        <p>Alamat: Jalan Raya Beji no 47 Karangsalamkidul</p>
        <p>Email: <a href="mailto:info@imgcentris.com" style="color: #007bff; text-decoration: none;">info@imgcentris.com</a></p>
        <div style="margin-top: 10px;">
        <a href="https://wa.me/6285742618603" target="_blank" style="margin: 0 10px; text-decoration: none;">
            <img src="whatsapp.png" alt="WhatsApp" style="width: 24px; height: 24px;">
        </a>
        <a href="https://www.tiktok.com/@firmannn2jzz" target="_blank" style="margin: 0 10px; text-decoration: none;">
            <img src="tiktok.png" alt="TikTok" style="width: 24px; height: 24px;">
        </a>
        <a href="https://www.instagram.com/img.centris" target="_blank" style="margin: 0 10px; text-decoration: none;">
            <img src="instagram.png" alt="Instagram" style="width: 24px; height: 24px;">
        </a>
    </div>
      </div>
    <p style="margin-top: 10px; color: #6c757d; font-size: 14px;">&copy; 2024 imgcentris. All rights reserved.</p>
</footer>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.js"></script>
</body>

</html>