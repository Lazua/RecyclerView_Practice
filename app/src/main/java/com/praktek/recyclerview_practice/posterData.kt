package com.praktek.recyclerview_practice

class posterData {
    public val data = arrayOf(
        arrayOf(
            "Black Adam",
            "2022",
            R.drawable.poster1
        ),
        arrayOf(
            "SHAZAM!: Just Say The Word",
            "2021",
            R.drawable.poster2
        ),
        arrayOf(
            "BLACK PANTHER: The King",
            "2019",
            R.drawable.poster3
        ),
        arrayOf(
            "BLACK PANTHER: Wakanda Forefer",
            "2023",
            R.drawable.poster4
        ),
        arrayOf(
            "TRANSFORMERS: The Last Knight",
            "2021",
            R.drawable.poster5
        ),
        arrayOf(
            "Kimi No Nawa",
            "2016",
            R.drawable.poster6
        )


    )
    val listPoster: ArrayList<poster> get(){
        val list = arrayListOf<poster>()
        for (aData in data){
            val poster = poster()
            poster.judul = aData[0] as String
            poster.tahun= aData[1] as String
            poster.photo = aData[2] as Int

            list.add(poster)
        }
        return list
    }
}