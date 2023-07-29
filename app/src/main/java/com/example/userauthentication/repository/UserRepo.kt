package com.example.userauthentication.repository

import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class UserRepo @Inject constructor(private val firestore: FirebaseFirestore) {
}