fun main() {
    //Soal 1
    for (a in 1 ..4){
        for (b in 1.. a){
            print("$b")
        }
        print("\n")
    }
    //Soal2
    var Nilai = 2
    var Pangkat = 5
    var Hasil : Double
    Hasil = Math.pow(Nilai.toDouble(),Pangkat.toDouble())
    println("\n Hasil Dari $Nilai pangkat $Pangkat \n" + Hasil )
}