package com.developerfect.fitness.models

class BaseResponse {
    var status: String? = null
    var code: Int? = null
    var mesage: String? = null
    var data: Any? = null

    companion object {
        fun happyCase(data: Any?): BaseResponse {
            val mRsponse = BaseResponse()
            mRsponse.code = 200
            mRsponse.mesage = "success"
            mRsponse.status = "success"
            mRsponse.data = data
            return mRsponse
        }

        fun errorCase(code: Int?, mesage: String?): BaseResponse {
            val mRsponse = BaseResponse()
            mRsponse.code = code
            mRsponse.mesage = mesage
            mRsponse.status = "faled"
            return mRsponse
        }
    }
}