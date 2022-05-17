package kr.nepp.jickbangcopy_20220517

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_room_detail.*
import kotlinx.android.synthetic.main.activity_view_room_detail.txtPrice
import kotlinx.android.synthetic.main.room_list_item.*
import kr.nepp.jickbangcopy_20220517.datas.RoomData

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("room") as RoomData

        txtPrice.text = roomData.getFormattedPrice()
        txtFloor.text = roomData.getFormattedFloor()
        txtDesc.text = roomData.description
    }
}