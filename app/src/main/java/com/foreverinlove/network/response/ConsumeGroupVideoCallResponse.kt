package com.foreverinlove.network.response

data class ConsumeGroupVideoCallResponse(
    val data: ConsumeGroupVideoCallData?,
    val message: String?,
    val status: Int?,
)

data class ConsumeGroupVideoCallData(
    val room_joined_member: ConsumeGroupVideoCallRoomJoinedMember?,
    val consumed_user_data: ConsumeGroupVideoCallConsumeUserData?,
)

data class ConsumeGroupVideoCallRoomJoinedMember(
    val room_id: Int?,
    val room_name: String?,
    val channel_name: String?,
    val room_icon: String?,
    val room_icon1: String?,
    val date_from: String?,
    val date_to: String?,
    val status: String?,
    val call_request_status: String?,
    val total_users: Int?,
    val created_at: String?,
    val updated_at: String?,
    val room_join_member: List<ConsumeGroupVideoCallRoomJoinMember>?,
)
data class ConsumeGroupVideoCallRoomJoinMember(
    val id:Int?,
    val room_id:String?,
    val user_id:String?,
    val created_at:String?,
    val updated_at:String?,
    val user:ConsumeGroupVideoCallUser?,
)
data class ConsumeGroupVideoCallUser(
    val id:Int?,
    val first_name:String?,
    val last_name:String?,
    val dob:String?,
    val age:String?,
    val email:String?,
    val status:String?,
    val phone:String?,
    val gender:String?,
    val job_title:String?,
    val login_otp:String?,
    val google_id:String?,
    val fb_id:String?,
    val apple_id:String?,
    val login_type:String?,
    val otp_expird_time:String?,
    val address:String?,
    val latitude:String?,
    val longitude:String?,
    val profile_video:String?,
    val lastseen:String?,
    val fcm_token:String?,
    val api_token:String?,
    val device_type:String?,
    val about:String?,
    val email_verified_at:String?,
    val email_verified:String?,
    val email_verified_otp:String?,
    val coins:String?,
    val available_video_call_duration:String?,
    val user_type:String?,
    val height:String?,
    val user_intrested_in:String?,
    val hobbies:String?,
    val is_plan_expired_notified:String?,
    val created_at:String?,
    val updated_at:String?,
    val full_name:String?,
    val total_video_call_duration:String?,
    val is_once_purchased:Boolean?,
    val user_images:List<ConsumeGroupVideoCallUserImage>?,
    val order_active:ConsumeGroupVideoCallOrderActive?,
)
data class ConsumeGroupVideoCallOrderActive(
    val id:Int?,
    val user_id:String?,
    val subscription_id:String?,
    val currency_code:String?,
    val start_date:String?,
    val end_date:String?,
    val payment_status:String?,
    val payment_type:String?,
    val month:String?,
    val status:String?,
    val call_chat_time_limit:String?,
    val like_per_day:String?,
    val plan_type:String?,
    val plan:ConsumeGroupVideoCallPlan?,
    val orders:List<ConsumeGroupVideoOrders>?,
)
data class ConsumeGroupVideoOrders(
    val id:Int?,
    val user_id:String?,
    val subscription_id:String?,
    val currency_code:String?,
    val start_date:String?,
    val end_date:String?,
    val payment_status:String?,
    val payment_type:String?,
    val month:String?,
    val status:String?,
    val call_chat_time_limit:String?,
    val like_per_day:String?,
    val plan_type:String?,
    val created_at:String?,
    val updated_at:String?,
)
data class ConsumeGroupVideoCallPlan(
    val id:Int?,
    val title:String?,
    val description:String?,
    val search_filters:String?,
    val like_per_day:Int?,
    val super_like_par_day:String?,
    val group_video_call_and_chat:String?,
    val video_call_duration:String?,
    val my_likes:String?,
    val who_views_me:String?,
    val private_chat_request:String?,
    val price:String?,
    val currency_code:String?,
    val month:String?,
    val plan_duration:String?,
    val plan_type:String?,
)
data class ConsumeGroupVideoCallUserImage(
    val id:Int?,
    val user_id:String?,
    val url:String?,
)

data class ConsumeGroupVideoCallConsumeUserData(
    val on_going_group_call_id: Int?,
    val room_id: String?,
    val user_id: String?,
    val channel_name: String?,
    val u_id: String?,
    val token: String?,
    val created_at: String?,
    val updated_at: String?,
)