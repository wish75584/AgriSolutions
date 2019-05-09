public interface ApiInterface {

    @GET("getmaster.php")
    Call<List<WorkMasterModule>> getMaster();
}
