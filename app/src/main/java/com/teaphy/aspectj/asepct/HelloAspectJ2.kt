package com.teaphy.aspectj.asepct

import android.util.Log
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before

@Aspect
class HelloAspectJ {

    @Before("execution(* com.teaphy.aspectj.MainActivity.helloAspect(..))")
    fun beforeHello() {
        Log.e("teaphy", "前置通知：beforeHello")
    }
}
