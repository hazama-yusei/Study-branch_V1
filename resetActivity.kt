class ProfileActivity {

    fun onCreate() {
        println("resetActivity created")
    }

    fun loadProfile(userName: String) {
        println("Loading profile: $userName")
    }

    fun updateProfile(userName: String) {
        println("reset updated: $userName")
    }

    fun onDestroy() {
        println("resetActivity destroyed_test")
    }
}