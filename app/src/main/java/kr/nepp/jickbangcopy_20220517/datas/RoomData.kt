package kr.nepp.jickbangcopy_20220517.datas

import java.io.Serializable

class RoomData(
    val price: Int,
    val address:String,
    val floor:Int,
    val description:String,
) : Serializable {

    fun getFormattedFloor() : String{

        if (this.floor >= 1){
            return "${this.floor}층"
        }
        else if (this.floor == 0 ) {
            return "반지하"
        }
        else {
            return "지하 ${-this.floor}층"
        }

    }

    fun getFormattedPrice() : String{

        if (this.price < 10000) {
            return "%,d".format(price)
        }
        else{
            val uk = this.price / 10000 //정수와 정수의 나눗셈은 정수
            val rest = this.price % 10000 //나머지 정수

            return "${uk}억 ${"%, d".format(rest)}"
        }

    }
}


