using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class GamePlay : MonoBehaviour {

    public static GamePlay instance;

    [SerializeField]
    private Button instructionButton;

    [SerializeField]
    private Text scoreText, endScoreText, highScoreText;

    [SerializeField]
    private GameObject gameOverPanel;

    [SerializeField]
    private GameObject scoreGame;

    [SerializeField]
    private GameObject pausePanel;

    [SerializeField]
    private Button pauseButton;


    void Awake()
    {
        Time.timeScale = 0;
        _MakeInstance();
    }

    public void _MakeInstance()
    {
        if (instance == null)
        {
            instance = this;
        }
    }
    public void _Instruction()
    {
        Time.timeScale = 1;
        instructionButton.gameObject.SetActive(false);

    }

    public void _GetScore(int score)
    {
        scoreText.text = score.ToString();
    }

    public void _Died(int score)
    {
        Time.timeScale = 0;
        gameOverPanel.SetActive(true);
        scoreGame.SetActive(false);
        pauseButton.gameObject.SetActive(false);

        endScoreText.text = score.ToString();
        if (score > Manager.instance.GetHighScore())
        {
            Manager.instance.SetHighScore(score);
        }
        highScoreText.text = Manager.instance.GetHighScore().ToString();
    }

    public void _MenuButton()
    {
        Application.LoadLevel("MainMenu");
    }

    public void _RestartButton()
    {
        Application.LoadLevel("FlappyBird");
    }

    public void _PauseButton()
    {
        Time.timeScale = 0;
        pausePanel.SetActive(true);
        pauseButton.gameObject.SetActive(false);
    }

    public void _ResumeButton()
    {
        Time.timeScale = 1;
        pausePanel.SetActive(false);
        pauseButton.gameObject.SetActive(true);
    }

}
