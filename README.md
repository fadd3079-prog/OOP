# RESPONSI AKHIR PRAKTIKUM PBO - PAKET OTOMOTIF

* **Nama:** Mufaddhol

* **NIM:** H1D025069

## STRUKTUR DIREKTORY

```
.src/Responsi
├── kendaraan.java
├── kontrolMesin.java
├── Main.java
├── mobilSport.java
├── navigasi.java
├── screenshot
│   └── output.png
└── trukKargo.java

2 directories, 7 files

```

## COMPILE

## Linux (arch)

Install jdk:

```
sudo pacman -S jdk-openjdk
```

run:

```
java Main.java
```

### Windows (cmd/powershell):

```
java Main.java
```

## SCREENSHOT OUTPUT
<img src="src/Responsi/screenshot/output.png">


## Ceklis Pemenuhan Syarat Teknis

Sistem telah memenuhi 10 persyaratan teknis responsi:

1. State & Behavior: Terdapat variabel dan method pada abstract class dan subclass.
2. Immutability: Menggunakan `static final` untuk batas kecepatan dan `private final` untuk nomor rangka.
3. Enkapsulasi & Overloading: Atribut bersifat `private`, memiliki smart setter, dan constructor overloading.
4. Inheritance: `MobilSport` dan `TrukKargo` mewarisi class `Kendaraan`.
5. Super Chaining: Menggunakan `super(...)` pada constructor dan pemanggilan method induk.
6. Method Overriding: Mengimplementasikan ulang method `gasPol()` dan `tampilkanInfo()`.
7. Abstract Class: `Kendaraan` merupakan abstract class dengan method abstrak `gasPol()`.
8. Logika Percabangan: Method `gasPol()` menggunakan kondisi kecepatan untuk menentukan aksi dan output.
9. Polimorfisme Interface: Objek `TrukKargo` menggunakan tipe referensi `kontrolMesin`.
10. Multiple Interface: `MobilSport` mengimplementasikan interface `kontrolMesin` dan `navigasi`.
