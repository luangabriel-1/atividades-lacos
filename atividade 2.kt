
fun main() {

    for (i in 10 downTo 1) {
        println(i)
    }

    println("Contagem finalizada! VAI!")


// questao 2
    val numero = 7

    for (i in 1..10) {
        println("Questao 2 $numero x $i = ${numero * i}")
    }


// questao 3
    var soma = 0

    for (i in 1..100) {
        soma += i
    }

    println("Questao 3 Soma total: $soma")

    // questao 4
    val carrinho = listOf("Camiseta", "Calça", "Tênis", "Boné")

    for (produto in carrinho) {
        println("Questao 4 Item no carrinho: $produto")
    }

    // questao 5
    var tentativa = 1

    do {
        println("Questao 5 Tentativa $tentativa: Validando credenciais...")
        tentativa++
    } while (tentativa <= 3)

    // questao 6
    var Soma = 0

    for (numero in 2..50 step 2) {
        Soma += numero
    }

    println("Questao 6 Soma dos números pares: $Soma")

// questao 7

    for (progresso in 0..100 step 10) {

        if (progresso == 50) {
            println("Erro no download! Operação cancelada.")
            break
        }

        println("Questao 7 Download em $progresso%")
    }
    // questao 8
    val pratos = listOf("Hambúrguer", "Pizza", "Sushi", "Lasanha")
    val itemEsgotado = "Pizza"

    for (item in pratos) {

        if (item == itemEsgotado) {
            continue
        }

        println("Questao 8 Item disponível: $item")
    }

    //questao 9
        val tarefas = listOf(
            "Estudar Kotlin",
            "Fazer exercícios",
            "Comprar pão",
            "Limpar casa"
        )

        for ((indice, tarefa) in tarefas.withIndex()) {
            println("Questao 9 Tarefa ${indice + 1}: $tarefa")
        }

    // questao 10
        val meta = 500.0

        val depositos = listOf(
            100.0,
            150.0,
            200.0,
            100.0,
            50.0
        )

        var saldo = 0.0

        for (deposito in depositos) {

            saldo += deposito

            if (saldo >= meta) {
                println("Questao 10 Meta atingida! Saldo atual: R$ $saldo")
                break
            }
        }
    // Questao 11
        val n = 5

        for (linha in 0 until n) {

            for (coluna in 0 until n) {

                if (linha == coluna) {
                    print("X ")
                } else {
                    print("* ")
                }
            }
            println()
        }

    // Questao 12
    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana")
    val idades = listOf(17, 21, 15, 30)

    for (i in nomes.indices) {

        val nome = nomes[i]
        val idade = idades[i]

        if (idade < 18) {
            println("$nome: Questao 12 Acesso Negado (Menor de idade)")

        } else if (idade <= 25) {
            println("$nome: Acesso Permitido (Perfil Jovem)")

        } else {
            println("$nome: Acesso Permitido (Perfil Sênior)")
        }
    }

// questao 13
    val Numero = 29
    var Primo = true

    for (divisor in 2 until Numero) {

        if (Numero % divisor == 0) {
            Primo = false
            break
        }
    }

    if (Primo) {
        println("$Numero Questao 13 é primo.")
    } else {
        println("$Numero não é primo.")
    }

// questao 14
    val Enumero = 6
    var fatorial = 1
    var contador = Enumero

    while (contador >= 1) {
        fatorial *= contador
        contador--
    }

    println("Questao 14 Fatorial de $Enumero = $fatorial")


// Questao 15
    val lotes = listOf(
        listOf(100.0, 50.0, 200.0),
        listOf(80.0, -20.0, 150.0),
        listOf(30.0, 40.0)
    )

    loopLotes@ for (lote in lotes) {

        for (valor in lote) {

            if (valor < 0.0) {
                println(
                    "Transação inválida encontrada (R$ $valor). " +
                            "Interrompendo todo o processamento!"
                )

                break@loopLotes
            }

            println("Questao 15 Transação processada: R$ $valor")
        }
    }
}