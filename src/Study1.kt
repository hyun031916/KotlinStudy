fun main(args : Array<String>){
    println("Hello World")

    //타입 추론
    var a = "Hello"
    var b = 1234
    var raw = """
        Hello!
    """

    var s = "$a and $b"
    println(s)

    var anyValue : Any
    anyValue = 100
    anyValue = "Hello"


    // nullable 타입
    // String s = null;
    // Null can not be a value of a non-null type String
    var str : String? = "Hello"
    str = null
    println(str?.length?.dec()?.div(2))
    /*
    if(str != null) {
        Integer i = str.length();
        if(i!= null) {
            Integer result = i.dec();
            if(result != null) {
                Integer final = result.div(2)
                if(final != null) {
                    sysout(final)
                } else {
                    sysout("에러!")
                }
            }
        }
    }
    */
    var str2 : String = "ASDF"
    println(str2.length.dec().div(2))

    var str3 = "Hello3"


    var ss : String? =null
    //!! 연산자(null 값이 대입되지 않았음을 프로그래머가 보증)
    //nullable 타입을 그냥 null 허용하지 않는 타입으로 강제 변환
    //var ss2 = ss!!
    //println(ss2.length) => 오류

    //엘비스 연산자( ?: )
    var result = ss?.length ?: 0
    println(result)

    //==, === 연산자
    //코틀린
    //equals 가  ==
    //==가 ===
    var hello = listOf("Hello")
    println(hello == listOf("Hello"))   //동등 비교 ( 값 비교)
    println(hello === listOf("Hello"))  //참조 비교( 주소값 비교)

    print((1..5).javaClass.simpleName)
    for(i in 1..5){
        println(i)
    }

    var hello2 = listOf("Hello", "World")
    for(n in hello2){
        println(n)
    }

}