Este programa está diseñado para modelar y gestionar el registro de consumo de energía eléctrica mediante un **medidor eléctrico** utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

* **Define la clase `MedidorElectrico`:** Modela un medidor conteniendo sus atributos principales: el número de identificación del dispositivo (`numeroMedidor`), la lectura anterior registrada (`lecturaAnterior`) y la lectura actual (`lecturaActual`).
* **Valida las lecturas a través del constructor:** Asegura la consistencia de los datos al exigir que la `lecturaActual` sea mayor o igual a la `lecturaAnterior` al momento de inicializar el objeto.
* **Calcula el consumo (`calcularConsumo`):** Implementa un método que retorna la diferencia numérica entre ambas lecturas para determinar la energía total consumida en el periodo.
* **Actualiza el medidor (`registrarNuevaLectura`):** Permite ingresar una nueva lectura para desplazar los valores y mantener actualizado el estado del medidor en los ciclos de facturación.
* **Ejecuta la prueba (`main`):** Instancia el objeto `MedidorElectrico`, simula el paso de un mes registrando una nueva lectura, y muestra el resultado del consumo calculado por la consola.
