package kr.nepp.jickbangcopy_20220517

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.nepp.jickbangcopy_20220517.datas.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mRoomList.add( RoomData(price = 8000, address = "서울시 종로구", floor = 1, description = "1번째 방입니다."))
        mRoomList.add( RoomData(price = 28500, address = "서울시 금천구", floor = -3, description = "2번째 방입니다."))
        mRoomList.add( RoomData(price = 18000, address = "서울시 중랑구", floor = 0, description = "3번째 방입니다."))
        mRoomList.add( RoomData(price = 22000, address = "서울시 영등포구", floor = 2, description = "4번째 방입니다."))
        mRoomList.add( RoomData(price = 25000, address = "서울시 강서구", floor = -1, description = "5번째 방입니다."))
        mRoomList.add( RoomData(price = 4000, address = "서울시 강남구", floor = -2, description = "6번째 방입니다."))
        mRoomList.add( RoomData(price = 12400, address = "서울시 강동구", floor = 3, description = "7번째 방입니다."))
        mRoomList.add( RoomData(price = 13300, address = "서울시 강서구", floor = 4, description = "8번째 방입니다."))




    }
}