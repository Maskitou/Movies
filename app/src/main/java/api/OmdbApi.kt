package api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface OmdbApi  {
    @GET(
        "?apikey=2a66aa0e" +
                "&s=Harry" +
                "&y="
    )
    fun fetchContents(): Call<FilmResponse>

    @GET
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>
}