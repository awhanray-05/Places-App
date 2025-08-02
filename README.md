# 🚗 Places App with License Plate Recognition

This is a smart Android Kotlin application designed to showcase an **on-device license plate recognition system** using CameraX and ML Kit OCR, combined with saved places listing and Android for Cars support. It integrates camera capture, cropping, text recognition, Firebase Cloud Messaging, and Android Auto compatibility to deliver a complete, modern automotive-focused experience.

---

## 🚀 Features

- 📷 **CameraX photo capture**
  - Captures images of vehicle number plates
  - Supports cropping with **uCrop**
- 🧾 **On-device license plate OCR**
  - Uses Google ML Kit Text Recognition to read Indian-style number plates
  - Validates against a regex pattern for Indian registration plates
- 🗂️ **Place Listing**
  - Shows a scrollable list of saved places using Jetpack Compose
  - Opens navigation intents to these places on tap
- 🚘 **Android for Cars integration**
  - Detects projection state (Android Auto / Automotive OS)
  - Uses `CarConnection` to update UI with projection status
- 🔔 **Push Notifications**
  - Retrieves Firebase Cloud Messaging (FCM) token at startup
  - Requests POST_NOTIFICATIONS permission for Android 13+
- 🌍 **Background location service**
  - Starts a foreground location tracking service for car-based apps
- 🖼️ **Asset-based OCR fallback**
  - Runs license plate recognition on a sample asset image if present
- 🛡️ **Runtime Permissions**
  - Camera, location, and notifications requested on the fly
- 🎨 **Material 3 Theming** with Jetpack Compose

---

## 🧩 Architecture

This app uses:
- **Jetpack Compose** for modern UI
- **CameraX** for camera preview & capture
- **ML Kit Text Recognition** for on-device OCR
- **uCrop** for user-driven image cropping
- **MVVM-like architecture** (with repository for places data)
- **Firebase Cloud Messaging** for push notification token handling

---

## 📂 Key Modules

| Module                | Description |
|-----------------------|-------------|
| `MainActivity.kt`     | Core logic, camera, OCR, Compose layout |
| `PlacesRepository.kt` | Data repository for places |
| `PlaceList` Composable | Renders the saved places list |
| `ProjectionState` Composable | Shows Android Auto connection status |
| `LocationService`     | Starts a background location tracker |
| `LicensePlateRecognizer` | Optional OCR helper class (if implemented separately) |

---

## 📦 Getting Started

### Prerequisites

- Android Studio Koala/Giraffe (or later)
- Kotlin 1.9+
- Firebase project for Cloud Messaging
- Physical device with Camera permissions (recommended)
- Android Automotive OS / Android Auto emulator (optional)

### Installation

1. Clone the repo:
   ```bash
   git clone https://github.com/awhanray-05/your-repo-name.git
