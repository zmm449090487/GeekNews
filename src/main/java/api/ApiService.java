package api;

import bean.MusicDemo;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    public String url = "https://api.apiopen.top/";
    @GET("musicRankingsDetails?type=1")
    Observable<MusicDemo> getData();
}
