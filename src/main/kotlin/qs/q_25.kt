/**
Q25: Implement a sealed class NetworkResponse with subclasses Success, Error, and Loading. Write a function that takes a NetworkResponse and uses a when expression to handle each case.
*/
class q_25 {
    init {
        println("q_25 called")
        val success = NetworkResponse.Success("Data received successfully")
        val error = NetworkResponse.Error("Failed to fetch data")
        val loading = NetworkResponse.Loading

        handleResponse(success)
        handleResponse(error)
        handleResponse(loading)
    }
    
}

fun handleResponse(response: NetworkResponse<String>) {
    when (response) {
        is NetworkResponse.Success -> println("Success: ${response.data}")
        is NetworkResponse.Error -> println("Error: ${response.message}")
        is NetworkResponse.Loading -> println("Loading...")
        else -> {}
    }
}

sealed class NetworkResponse<out T> {
    data class Success<T>(val data: T) : NetworkResponse<T>()
    data class Error(val message: String) : NetworkResponse<Nothing>()
    object Loading : NetworkResponse<Nothing>()
}
