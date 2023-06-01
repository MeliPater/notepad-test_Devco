# Melissa Paternina Jiménez
# Scenario 1: Crear una nota de texto enriquecido con letra en negrita

  Feature: Nota de texto enriquecido con letra en negrita
    Yo como usuario
    Quiero acceder a la página online-notepad
    Para crear una nota de texto enriquecido en negrita

  Background:
    Given Meli accede a la página online-notepad

    Scenario: Creación nota de texto enriquecido con letra en negrita
      When ella crea una nota de texto enriquecido con letra en negrita
      Then ella visualiza la nota creada