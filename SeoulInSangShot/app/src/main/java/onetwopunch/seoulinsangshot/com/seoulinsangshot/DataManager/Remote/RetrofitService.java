package onetwopunch.seoulinsangshot.com.seoulinsangshot.DataManager.Remote;

import onetwopunch.seoulinsangshot.com.seoulinsangshot.DataManager.Data.AreaVO;
import onetwopunch.seoulinsangshot.com.seoulinsangshot.DataManager.Data.FrameVO;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by kwakgee on 2017. 9. 23..
 */

public interface RetrofitService {

    @GET("/image")
    Call<FrameVO> getTestData();


    @GET("/mainview")
    Call<AreaVO> getAreaData();


}
