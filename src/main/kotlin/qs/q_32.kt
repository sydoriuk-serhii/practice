import kotlinx.coroutines.*
import kotlin.random.Random
/**
Q32: Implement a suspend function that fetches data and handles retry logic in case of failure. Retry up to 3 times with a delay between attempts.
*/
class q_32 {
    init {
        println("q_32 called")
        runBlocking {
            val response = fetchDataWithRetry()
            handleResponse(response)
        }
    }
}

suspend fun fetchData(): NetworkResponse<String> {
    delay(500L)
    if (Random.nextBoolean()) {
        return NetworkResponse.Success("some important data")
    }
    return NetworkResponse.Error("conection error(")}

suspend fun fetchDataWithRetry(maxRetries: Int = 3): NetworkResponse<String> {
    handleResponse(NetworkResponse.Loading)
    repeat(maxRetries) { attempt ->
        val data = fetchData()
        if (attempt.inc() < maxRetries && data is NetworkResponse.Error) {
            handleResponse(NetworkResponse.Loading)
            delay(500L)
        } else {
            return data
        }
    }
    return NetworkResponse.Error("conection error(")
}

/*sealed class NetworkResponse<out T> {
    data class Success<T>(val data: T) : NetworkResponse<T>()
    data class Error(val message: String) : NetworkResponse<Nothing>()
    object Loading : NetworkResponse<Nothing>()
}

fun handleResponse(response: NetworkResponse<String>) {
    when (response) {
        is NetworkResponse.Success -> println("Success: ${response.data}")
        is NetworkResponse.Error -> println("Error: ${response.message}")
        is NetworkResponse.Loading -> println("Loading...")
    }
}*/
