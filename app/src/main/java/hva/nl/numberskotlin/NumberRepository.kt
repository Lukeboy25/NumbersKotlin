package hva.nl.numberskotlin

class NumbersRepository {
    private val numbersApi: NumbersApiService = NumbersApi.createApi()

    fun getRandomNumberTrivia() = numbersApi.getRandomNumberTrivia()
}
