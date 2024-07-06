# 📱 **Quiz App Mobile Android** 🎉

## Description

Quiz App is an interactive and educational Android mobile application designed to allow users to test their knowledge on various Android development topics. The app offers a user-friendly interface, uses Firebase for authentication and data storage, and integrates Google Maps to display the user's location.

## Table of Contents

- [Description](#description)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Technologies Used](#technologies-used)
- [Contributors](#contributors)
- [License](#license)
- [Screenshots](#screenshots)

## Features

- 🔒 Secure user account creation
- 🧠 Dynamic quiz generation
- 🔄 Data synchronization with Firebase
- 🗺️ Display of user location on Google Maps after quiz completion
- 👥 User management and score tracking

## Installation

1. Clone the GitHub repository:
   ```sh
   git clone https://github.com/imanebelhaj/QuizApp.git

2. Open the project in Android Studio.

3. Configure Firebase in your project:
   - Create a Firebase project on the [Firebase Console](https://console.firebase.google.com/).
   - Add the Android app to your Firebase project.
   - Download the `google-services.json` file and place it in the `app` directory of your project.
   - Enable Firebase Authentication and Firestore in the Firebase console.

4. Add API keys for Google Maps:
   - Obtain a Google Maps API key from the [Google Cloud Console](https://console.cloud.google.com/).
   - Add the API key to your `AndroidManifest.xml` file:
     ```xml
     <meta-data
         android:name="com.google.android.geo.API_KEY"
         android:value="YOUR_API_KEY" />
     ```

5. Sync Gradle dependencies.

## Usage

1. Launch the app on an emulator or an Android device.
2. Create an account or log in with an existing account.
3. Choose a quiz from the available options.
4. Answer the quiz questions and submit your answers.
5. View your score and your location on the Google Maps page.

## Technologies Used

- Java
- Android Studio
- Firebase (Authentication, Firestore, Storage)
- Google Maps API

## Contributors

- **Imane Belhaj**


## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Screenshots

Here are some screenshots of the Quiz App:



<img width="200" alt="login" src="https://github.com/imanebelhaj/QuizApp/assets/114827745/812609cf-8ea5-45ad-b937-29698a479ef3">

<img width="190" alt="register" src="https://github.com/imanebelhaj/QuizApp/assets/114827745/202114ee-0b25-4edd-881a-da565c3df0aa">


<img width="180" alt="home" src="https://github.com/imanebelhaj/QuizApp/assets/114827745/ae03946e-9735-4ed5-af38-908fad878fd4">


<img width="460" alt="quiz1" src="https://github.com/imanebelhaj/QuizApp/assets/114827745/e0828ee6-8514-472d-b41b-dc2e60e77157">
<img width="234" alt="quiz2" src="https://github.com/imanebelhaj/QuizApp/assets/114827745/642359c1-6562-4eef-a4cb-52f9c7f81289">
<img width="451" alt="quiz3" src="https://github.com/imanebelhaj/QuizApp/assets/114827745/52a68dcb-633c-4e54-94be-7c9edba055c8">
<img width="284" alt="quiz4" src="https://github.com/imanebelhaj/QuizApp/assets/114827745/7f05e519-07b1-4e2b-a7d4-93c2529b42f1">


<img width="160" alt="score" src="https://github.com/imanebelhaj/QuizApp/assets/114827745/acf80b79-7239-4c3e-8e7f-16be4bc97db0">




---

Thank you for using Quiz App! If you have any questions or suggestions, feel free to contact us. 🚀
