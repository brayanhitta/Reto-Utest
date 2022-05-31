#Autor: Brayan Hitta
  #language: es

@HU001
Característica: Crear un nuevo usuario en la pagina Utest
  Como usuario
  Quiero ingresar a la pagina Utest
  Para validar la creacion de un usuario

  @Caso1
  Esquema del escenario: Creacion usuario Utest
    Dado que Brayan se encuentra en la pagina Utest
    Y da clic en el boton Join Today
    Cuando ingresa datos en el formulario step1
      | firstName   | lastName   | email   |
      | <firstName> | <lastName> | <email> |
    Y ingresa datos en el formulario step2
      | city   | postalCode   | country   |
      | <city> | <postalCode> | <country> |
    Y ingresa datos en el formulario step3
    Y ingresa datos en el formulario step4
      | password   | confirmPassword   |
      | <password> | <confirmPassword> |
    Y crea el usuario
    Entonces verifica que se regrese a la pagina principal

    Ejemplos:
      | firstName | lastName | email                | city  | postalCode | country  | password        | confirmPassword |
      | Juan      | cruz     | juancruz@example.com | Giron | 60001      | Colombia | 123456789Bc*Bdd | 123456789Bc*Bdd |

