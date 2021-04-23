abstract class Top {
}

class Tip: Top(){

}

abstract class Alpha{

}

abstract class Omega:Alpha(){

}

interface Foo{

}

open class Bar:Foo{

}

class Baz:Bar(){

}

interface Fi{

}
open class Fo: Fi{

}
interface Fee{

}
class Fum: Fo(), Fee{

}
