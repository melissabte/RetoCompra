# encoding:iso-8859-1
#-----------------------------------------------------------------------------------------------------------------#
#-----------------------------------RETO-SOPHOS-------------------------------------------------------------------#
Feature: yo como usuario quiero comprar un producto en la pagina plazavea.com

yo requiero validar que el producto fue agregado al carrito correctamente

@Carritodecompras
Scenario: validar que el producto quedo en el carrito de compras  
    Given Que felipe ingresa a la pagina de plaza vea
    When Desea buscar un Televisor lo selecciona y envia al carrito de compras
    Then Muestre el producto en el carrito de compras
      
      