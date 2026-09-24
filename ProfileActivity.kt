class ProfileActivity {

    fun onCreate() {
        println("ProfileActivity created")
    }

    fun loadProfile(userName: String) {
        println("Loading profile: $userName")
    }

    fun updateProfile(userName: String) {
        println("Profile updated: $userName")
    }

    fun onDestroy() {
        println("ProfileActivity destroyed_test")
    }
}