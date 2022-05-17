package kr.nepp.jickbangcopy_20220517.adapters

import android.content.Context
import android.widget.ArrayAdapter
import kr.nepp.jickbangcopy_20220517.datas.RoomData

class RoomAdapter(

    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<RoomData>
) : ArrayAdapter<RoomData>(mContext, resId, mList) {


}