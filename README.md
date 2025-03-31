# FetchProject App

Hi there, I am a **Mobile Android Engineer @ Grubhub**, ready to take on my next challenge 🚀

This project demonstrates a clean Kotlin Android app that loads and displays grouped data from a remote JSON API using **Retrofit**, **RxJava**, and **ViewBinding**.

---

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
- Retrofit2 + RxJava2
- ViewBinding

---

## 🧩 Code Structure

- `MainActivity.kt` – sets up ViewBinding, fetches data, and initializes the UI
- `ApiService.kt` – Retrofit interface for fetching data
- `RetrofitClient.kt` – singleton providing configured Retrofit instance
- `GroupedItem.kt` – helper data class representing grouped results

**Layouts:**

- `activity_main.xml` – main container layout
- `item_group.xml` – layout for each listId group
- `item_child.xml` – layout for each item within a group

---

## 🙌 Contact

Feel free to connect or collaborate — I'm always open to cool ideas and mobile challenges!

**📧** [YourEmail@domain.com](mailto:YourEmail@domain.com)  
**🔗** [LinkedIn / Portfolio / GitHub if desired]


