package org.techtown.handtxver1.questionnaires.type9

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface UpdateStressSurveyInterface {

    @FormUrlEncoded
    @POST("hanDtxPrototypeApp/app_update_stress_survey/")
    fun requestUpdateStressSurvey(
        @Field("user_id") user_id: String,
        @Field("date") date: String,
        @Field("result1") result1: Int,
        @Field("result2") result2: Int,
        @Field("result3") result3: Int,
        @Field("result4") result4: Int,
        @Field("result5") result5: Int,
        @Field("result6") result6: Int,
        @Field("result7") result7: Int
    ): Call<UpdateStressSurveyOutput>

}