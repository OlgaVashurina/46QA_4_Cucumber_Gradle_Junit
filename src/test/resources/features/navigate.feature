Feature: Домашняя страница
#Scenario Outline: Шаблон сценария для тестирования с разными данными.
  #Given: Устанавливает начальные условия.
  #And: Дополнительное действие к предыдущему шагу.
  #When: Описывает событие, изменяющее состояние системы.
  #Then: Проверка ожидаемого результата.
  Scenario: Проверить, что на домашней отображается заголовок.
    Given Пользователь запускает браузер
    When Пользователь открывает домашнюю страницу ilcarro
    Then Проверить, что заголовок домашней страницы отображается
    And Пользователь закрывает браузер
