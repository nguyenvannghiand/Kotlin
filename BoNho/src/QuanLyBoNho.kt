fun main() {
    var psA = PhanSo(1, 5)
    var psB = PhanSo(3, 8)
    println("psA = ${psA.tu}" )
    println("psB = ${psB.tu}" )
    psA = psB
    println("---Sau khi gan psA=psB")
    println("Tu cua phan so A = ${psA.tu}")
    psB.tu = 113
    println("---Sau khi gan psB.tu=113")
    println("Tu cua phan so A = ${psA.tu}")
    var psC = PhanSo(115, 200)
    psB = psC
    println("---Sau khi gan psB=psC")
    println("Tu cua phan so A = ${psA.tu}")
}