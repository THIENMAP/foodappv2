package com.example.foodapp.retrofit;

import com.example.foodapp.model.GiohangModel;
import com.example.foodapp.model.LoaispModel;
import com.example.foodapp.model.Sanpham;
import com.example.foodapp.model.SanphamModel;
import com.example.foodapp.model.UserModel;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiBanHang {
    @GET("androi_getloaisp.php")
    Observable<LoaispModel> androi_getloaiSp();

    @GET("androi_getsanpham.php")
    Observable<SanphamModel> androi_getsanpham();

    @POST("chitiet.php")
    @FormUrlEncoded
    Observable<SanphamModel> getSanPhamRC(
            @Field("page") int page,
            @Field("loai") int loai
    );
    @POST("androi_dangki.php")
    @FormUrlEncoded
    Observable<UserModel> dangki(
            @Field("username") String username,
            @Field("email") String email,
            @Field("pass") String pass,
            @Field("mobile") String mobile
    );
    @POST("androi_addgiohang.php")
    @FormUrlEncoded
    Observable<GiohangModel> addgiohang(
            @Field("id_sanpham") String id_sanpham,
            @Field("id_khachhang") String id_khachhang,
            @Field("sosanphammua") String sosanphammua,
            @Field("tensp") String tensp,
            @Field("gia") String gia,
            @Field("urlanh") String urlanh
    );
    @POST("androi_getgiohang.php")
    @FormUrlEncoded
    Observable<GiohangModel> getgiohang(
            @Field("id_khachhang") String id_khachhang
    );
    @POST("androi_dangnhap.php")
    @FormUrlEncoded
    Observable<UserModel> dangnhap(
            @Field("email") String email,
            @Field("pass") String pass
    );

}
