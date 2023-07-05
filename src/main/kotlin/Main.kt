fun main(){
    var myStack = Stack()
    println(myStack.pop())
    myStack.push(5)
    myStack.push(24)
    myStack.push(62)
    println( myStack.peek())
    println(myStack.pop())
    println(myStack.peek())
    myStack.push(44)
    myStack.push(22)
    myStack.push(111)
    var x = myStack.pop()
    var y = myStack.pop()
    var z = x!!+y!!  //null assertion operator !!-making guarantees that those function are not null
    println(z)
    var str = "hello"
    var result = mutableListOf<Int>()
    var stack =Stack()
    str.forEach { c -> stack.push(c) }
    while (!stack.isEmpty()){
        result.add(stack.pop()!!)
    }
    println(result.joinToString(""))
}
class Stack{
    var data = mutableListOf<Int>()  //Char where Int is

    fun push(value: Int){
        data.add(value)
    }

    fun pop():Int?{
        if (data.isEmpty()){
            return null
        }
        val top = data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }
    fun peek():Int?{
        if (data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }
    fun isEmpty():Boolean{
        return data.isEmpty()
    }
}