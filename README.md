# Mobile Application with Jetpack Compose and Retrofit

Android application that displays a list of products with pagination and dark mode features. Built using modern Android technologies such as Jetpack Compose, Retrofit2, and Gson Converter.

## Features

- Displays a list of products with pagination
- Dark mode support
- Neat Rupiah price format
- Error handling for navigation buttons (previous/next)
- MVVM (Model-View-ViewModel) architecture

## Technologies Used

- **Programming Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Networking**: Retrofit2 with Gson Converter
- **Architecture**: MVVM (Model-View-ViewModel)
- **State Management**: ViewModel and StateFlow
- **Dependency Injection**: Hilt (if used)

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/czy/tugastigapemrogramanmobile/
│   │   │   ├── APIService.kt         # Interface for API endpoints
│   │   │   ├── MainActivity.kt       # Main activity with UI Compose
│   │   │   ├── MyModelView.kt        # ViewModel for business logic
│   │   │   ├── Product.kt            # Data class for Product model
│   │   │   ├── RetrofitInstance.kt   # Retrofit configuration
│   │   │   └── User.kt               # Data class for User model
│   │   └── res/
```

## How to Use

1. Clone this repository
2. Open the project in Android Studio
3. Wait for the Gradle sync process to complete
4. Run the application on the emulator or Android device

### Special Features

#### Rupiah Price Format
Product prices are formatted in the correct Rupiah format, including:
- The "Rp" symbol in front
- Thousands separator (.)
- Two digits behind the comma

Example: `Rp 1,234,567.89`

#### Error Handling Navigation Buttons
- The "Previous" button will be disabled when on the first page
- The "Next" button will be disabled when reaching the last page

#### Dark Mode
The application supports a dark theme that can be set through the device's system settings.

## <img src="https://media.giphy.com/media/utz68KlKM5LGBVF6HZ/giphy.gif" width="25px" alt="rocket"> Quotes of the day
<div align="center">
  <img src="https://quotes-github-readme.vercel.app/api?type=horizontal&theme=tokyonight" alt="Random Dev Quote" />
</div>
<br/>
<br/>
<div align="center">
  <img src="https://github-readme-streak-stats.herokuapp.com/?user=CZY774&theme=tokyonight&hide_border=true&background=1f1f1f&stroke=58a6ff&ring=58a6ff&fire=58a6ff&currStreakNum=ffffff&sideNums=ffffff&currStreakLabel=58a6ff&sideLabels=58a6ff&dates=ffffff" alt="GitHub Streak" />
</div>

## <img src="https://media.giphy.com/media/hvRJCLFzcasrR4ia7z/giphy.gif" width="25px" alt="waving hand"> Get In Touch
<div align="center">
  <a href="https://www.instagram.com/corneliusyoga" target="_blank"><img src="https://img.shields.io/badge/Instagram-%23E4405F.svg?&style=for-the-badge&logo=instagram&logoColor=white" alt="Instagram"></a>&nbsp;
  <a href="https://www.linkedin.com/in/cornelius-yoga-783b6a291" target="_blank"><img src="https://img.shields.io/badge/LinkedIn-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn"></a>&nbsp;
  <a href="https://www.youtube.com/channel/UCj0TlW5vLO6r_Nlwc8oFBpw" target="_blank"><img src="https://img.shields.io/badge/YouTube-%23FF0000.svg?&style=for-the-badge&logo=youtube&logoColor=white" alt="YouTube"></a>&nbsp;
  <a href="https://czy.digital" target="_blank"><img src="https://img.shields.io/badge/Portfolio-%23000000.svg?&style=for-the-badge&logo=react&logoColor=white" alt="Portfolio"></a>
  <br/><br/>
  <img src="https://komarev.com/ghpvc/?username=CZY774&style=flat-square&color=0366D6" alt="Profile Views" />
  <br/>
  <sub>Made by Cornelius Ardhani Yoga Pratama</sub>
</div>
