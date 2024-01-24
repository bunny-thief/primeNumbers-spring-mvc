package dev.passingarguments.primenumbersmvc.controllers;

import dev.passingarguments.primenumbers.PrimeNumbers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String showHome() {
        return "home";
    }

    @GetMapping("/main")
    public String showMain() {
        return "main";
    }

    @PostMapping(path = "/result", params = "checkPrime")
    public String showResultIsPrime(@RequestParam("number") int number,
                                    Model model) {
        String message = "";

        if (PrimeNumbers.isPrime(number)) {
            message = String.format("%d is a prime number.", number);
        } else {
            message = String.format("%d is not a prime number.", number);
        }

        model.addAttribute("message", message);

        return "display-result";
    }

    @PostMapping(path = "/result", params = "nextPrime")
    public String showResultNextPrime(@RequestParam("number") int number,
                                      Model model) {

        int nextPrime = PrimeNumbers.nextPrime(number);
        String message = String.format("%d is the next prime number after %d.", nextPrime, number);

        model.addAttribute("message", message);

        return "display-result";
    }

    @PostMapping(path = "/result", params = "getRange")
    public String showGetRange() {
        return "get-range";
    }

    @PostMapping(path = "/result", params = "primesInRange")
    public String showResultPrimesInRange(@RequestParam("firstNumber") int firstNumber,
                                          @RequestParam("secondNumber") int secondNumber,
                                          Model model) {

        String message = String.format("Prime numbers between %d and %d are:\n", firstNumber, secondNumber);
        int[] primes = PrimeNumbers.primesInRange(firstNumber, secondNumber);

        for (int i = 0; i < primes.length; i++) {
            message += primes[i];

            if (i < primes.length - 1) {
                message += ", ";
            } else {
                message += ".";
                break;
            }
        }

        System.out.println(message);
        model.addAttribute("message", message);

        return "display-result";
    }

}
