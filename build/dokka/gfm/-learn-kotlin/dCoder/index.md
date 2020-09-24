//[LearnKotlin](../index.md)/[dCoder](index.md)



# Package dCoder  


## Types  
  
|  Name|  Summary| 
|---|---|
| [Album](-album/index.md)| [jvm]  <br>Content  <br>data class [Album](-album/index.md)(**title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **año**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **nose**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **nosen**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **tracks**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Track](-track/index.md)>)  <br><br><br>
| [AnimalNew](-animal-new/index.md)| [jvm]  <br>Content  <br>open class [AnimalNew](-animal-new/index.md)  <br><br><br>
| [Animals](-animals/index.md)| [jvm]  <br>Content  <br>data class [Animals](-animals/index.md)(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **species**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>
| [Canine](-canine/index.md)| [jvm]  <br>Content  <br>open class [Canine](-canine/index.md) : [AnimalNew](-animal-new/index.md)  <br><br><br>
| [Child](-child/index.md)| [jvm]  <br>Content  <br>class [Child](-child/index.md) : [Parent](-parent/index.md)  <br><br><br>
| [Dog](-dog/index.md)| [jvm]  <br>Content  <br>class [Dog](-dog/index.md)  <br><br><br>
| [Dog1](-dog1/index.md)| [jvm]  <br>Content  <br>class [Dog1](-dog1/index.md)  <br><br><br>
| [GameOld](-game-old/index.md)| [jvm]  <br>Content  <br>class [GameOld](-game-old/index.md)  <br><br><br>
| [Hippo](-hippo/index.md)| [jvm]  <br>Content  <br>class [Hippo](-hippo/index.md) : [AnimalNew](-animal-new/index.md)  <br><br><br>
| [Parent](-parent/index.md)| [jvm]  <br>Content  <br>open class [Parent](-parent/index.md)  <br><br><br>
| [Student](-student/index.md)| [jvm]  <br>Content  <br>data class [Student](-student/index.md)(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>
| [Track](-track/index.md)| [jvm]  <br>Content  <br>data class [Track](-track/index.md)(**title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **durationInSeconds**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>
| [User](-user/index.md)| [jvm]  <br>Content  <br>data class [User](-user/index.md)(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>
| [Wolf](-wolf/index.md)| [jvm]  <br>Content  <br>class [Wolf](-wolf/index.md) : [Canine](-canine/index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [convertDecimalToOctal](convert-decimal-to-octal.md)| [jvm]  <br>Content  <br>fun [convertDecimalToOctal](convert-decimal-to-octal.md)(decimal: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [convertOctalToDecimal](convert-octal-to-decimal.md)| [jvm]  <br>Content  <br>fun [convertOctalToDecimal](convert-octal-to-decimal.md)(octal: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [foo](foo.md)| [jvm]  <br>Content  <br>fun [foo](foo.md)(ints: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)>): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>  <br><br><br>
| [getData](get-data.md)| [jvm]  <br>Content  <br>fun <[T](get-data.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> [getData](get-data.md)(clazz: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)<[T](get-data.md)>): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[T](get-data.md)>?  <br><br><br>
| [getStudents](get-students.md)| [jvm]  <br>Content  <br>fun [getStudents](get-students.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Student](-student/index.md)>  <br><br><br>
| [getUsers](get-users.md)| [jvm]  <br>Content  <br>fun [getUsers](get-users.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[User](-user/index.md)>  <br><br><br>
| [main](main.md)| [jvm]  <br>Content  <br>fun [main](main.md)(args: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br><br><br>
| [nameAndTotalTime_v1](name-and-total-time_v1.md)| [jvm]  <br>Content  <br>fun [nameAndTotalTime_v1](name-and-total-time_v1.md)(albums: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Album](-album/index.md)>): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)>>  <br><br><br>
| [nameAndTotalTime_v2](name-and-total-time_v2.md)| [jvm]  <br>Content  <br>fun [nameAndTotalTime_v2](name-and-total-time_v2.md)(albums: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Album](-album/index.md)>): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)>>  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [animals](index.md#dCoder//animals/#/PointingToDeclaration/)|  [jvm] var [animals](index.md#dCoder//animals/#/PointingToDeclaration/): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Animals](-animals/index.md)>   <br>
| [pinkFloyd](index.md#dCoder//pinkFloyd/#/PointingToDeclaration/)|  [jvm] val [pinkFloyd](index.md#dCoder//pinkFloyd/#/PointingToDeclaration/): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Album](-album/index.md)>   <br>

