class SearchActivity {

    fun onCreate() {
        println("SearchActivity created")
    }

    fun search(keyword: String) {
        println("Searching: $keyword")
    }

    fun showResult() {
        println("Search result displayed")
    }

    fun onDestroy() {
        println("SearchActivity destroyed")
    }
}