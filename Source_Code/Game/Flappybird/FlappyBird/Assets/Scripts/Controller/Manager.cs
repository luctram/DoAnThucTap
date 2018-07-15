using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Manager : MonoBehaviour {

    public static Manager instance;

    public const string highScore = "High Score";

    void Awake()
    {
        _MakeSingleInstance();
        IsGameStartedForTheFirstTime();
    }

    void IsGameStartedForTheFirstTime()
    {
        if (!PlayerPrefs.HasKey("IsGameStartedForTheFirstTime"))
        {
            PlayerPrefs.SetInt(highScore, 0);
            PlayerPrefs.SetInt("IsGameStartedForTheFirstTime", 0);
            SetHighScore(0);
        }
    }

    void _MakeSingleInstance() //điều hướng sang scene FlappyBird
    {
        if(instance != null)
        {
            Destroy(gameObject);
        }
        else
        {
            instance = this;
            DontDestroyOnLoad(gameObject);
        }
    }

    public void SetHighScore(int score)
    {
        PlayerPrefs.SetInt(highScore, score);
    }

    public int GetHighScore()
    {
        return PlayerPrefs.GetInt(highScore);
    }
}
