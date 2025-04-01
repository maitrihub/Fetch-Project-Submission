# FetchProject App

Hi there, I am Maitri I'm a **Mobile Android Engineer @ Grubhub**, ready to take on my next challenge.
This project demonstrates a clean Kotlin Android app that loads and displays grouped data from a remote JSON API using **Retrofit**, **RxJava**, and **ViewBinding**.

---

https://github.com/user-attachments/assets/8a59de74-ce5d-4536-8872-70422483601b


## 📱 Overview

The app fetches a list of items from: https://fetch-hiring.s3.amazonaws.com/hiring.json


It then:

- Filters out any item with a blank or null name
- Sorts the remaining items by `listId` and then by `name`
- Groups them by `listId`
- Displays them in a clean, scrollable grouped format

---

## 🛠️ Tech Stack

- Kotlin
- Retrofit + RxJava
- ViewBinding

---

## 🧩 Primary Code Structure

- `MainActivity.kt` – sets up ViewBinding, fetches data, and initializes the UI
- `ApiService.kt` – Retrofit interface for fetching data
- `RetrofitClient.kt` – singleton providing configured Retrofit instance

---

## 🙌 Contact

Feel free to email me if you have questions. Looking forward to connecting more!

